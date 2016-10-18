package jp.co.isid.cit;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jp.co.isid.cit.dto.LoginUser;

/***
 * @author li3051
 *参考:http://qiita.com/NagaokaKenichi/items/7cf2f427d88dfd4f56a8
 *参考:http://iplace.isid.co.jp/pages/viewpage.action?pageId=144572605
 *1.このクラスを実装
 *2.WebMvcConfiguration.javaクラスを実装し設定する。（"/**"になっているので全てのコントローラの前にインターセプトする）
 *3．src/main/resourceフォルダ内のapplication.propertiesにログ出力のパスを記述する
 *　　もしくはAppLoggerからのログのみ出力したい場合はsrc/main/resourceフォルダ内に
 *　　logback.xmlを作成し設定を記述する
 *AppLogger関連ファイル:WebMvcConfiguration.java と　application.propertiesもしくはlogback.xml
 *
 */

public class AppLogger implements HandlerInterceptor {

    // ロガー生成
    private static final Logger logger = LoggerFactory.getLogger("jp.co.cit.isid.AppLogger");

    @Override
public boolean preHandle(HttpServletRequest request,
	HttpServletResponse response, Object handler) throws Exception { //log出力のタイミング:コントローラーに入る前

    	 Method method = ((HandlerMethod) handler).getMethod();

    	 String esqId = "";
    	 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    	 if(authentication != null){
    		 Object principal = authentication.getPrincipal();
    		 if(principal instanceof LoginUser){
    			 esqId = ((LoginUser)principal).getEsqid();
}
}
          logger.info("HTTPメソッド："+request.getMethod()+"  ユーザー情報:"+esqId+ "  クラス名:"+method.getDeclaringClass()+"  メソッド名:"+method.getName());
    	 
	return true;
}


@Override
public void postHandle(HttpServletRequest request,
	HttpServletResponse response, Object handler,
	ModelAndView modelAndView) throws Exception { //log出力のタイミング:コントローラーの処理後
	/**
	*Method method = ((HandlerMethod)handler).getMethod();
	*logger.info("ユーザー:"+modelAndView.getModelMap()+
	*		"  HTTPメソッド："+request.getMethod()+"  コントローラ:"+method.getDeclaringClass()+"  メソッド:"+method.getName());
	**/
}


@Override
public void afterCompletion(HttpServletRequest request,
	HttpServletResponse reponse, Object handler, Exception e)
	throws Exception { //log出力のタイミング:画面遷移前
	//do something
}
}
