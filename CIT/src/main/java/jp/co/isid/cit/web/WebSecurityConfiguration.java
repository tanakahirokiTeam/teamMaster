/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.co.isid.cit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import jp.co.isid.cit.service.EsqUserService;

@Configuration
@EnableWebSecurity // SpringSecurity4
// @EnableWebMvcSecurity //以前のバージョン 非推奨
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// httpパスアクセス許可、不許可設定
		http.authorizeRequests().antMatchers("/","/images/**", "/css/**", "/javascript/**", "/webjars/**").permitAll() // 指定パスへは全ユーザーアクセス許可
				.anyRequest().authenticated(); // その他のリクエストは認証が必要
		http.formLogin().loginPage("/index") // ログインフォームのパス
				.defaultSuccessUrl("/menu", true) // ログイン成功時の遷移先
				//.failureUrl("/enquete/preview") //ログイン失敗時の遷移先
				.usernameParameter("esqid") // ログインフォームで使用するユーザー名のinput
				//name
				.passwordParameter("password")// ログインフォームで使用するパスワードのinput
				// name
				.permitAll();
		http.logout()
				// ログアウトがパス(GET)の場合設定する（CSRF対応）
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout**"))
				// .logoutUrl("/logout") // ログアウトがPOSTの場合設定する
				.permitAll();
	}

	@Configuration
	protected static class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {

		@Autowired
		private EsqUserService esqUserService;

		@Override
		public void init(AuthenticationManagerBuilder auth) throws Exception {
			// 認証するユーザーを設定する
			auth.userDetailsService(esqUserService)
					// 入力値をbcryptでハッシュ化した値でパスワード認証を行う
					.passwordEncoder(new BCryptPasswordEncoder());
			System.out.println("　＊＊＊＊＊＊＊パスワード認証＊＊＊＊＊＊通過");
//			暗号化後パスワード生成
//			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//			String pass = bCryptPasswordEncoder.encode("pass");
//			System.out.println(pass);
//			System.out.println("\n\n");
			
		}
	}

}
