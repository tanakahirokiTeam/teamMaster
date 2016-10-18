package jp.co.isid.cit;

import java.util.function.Supplier;

import org.seasar.doma.jdbc.AbstractJdbcLogger;
import org.seasar.doma.jdbc.Sql;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

/**
 * 
 * @author li3051
 *sersor2+doma
 *参考:http://doma.seasar.org/apidocs/org/seasar/doma/jdbc/JdbcLogger.html#logAutoCommitEnablingFailure(java.lang.String, java.lang.String, java.sql.SQLException)
 *kaigit
 *参考:http://iplace.isid.co.jp/pages/viewpage.action?pageId=144572609
 *1.このクラスを実装
 *2.DataSourceConfiguration.javaクラスに追記
 *3．src/main/resourceフォルダ内のapplication.propertiesにログ出力のパスを記述する
 *　　もしくはAppLoggerからのログのみ出力したい場合はsrc/main/resourceフォルダ内に
 *　　logback.xmlを作成し設定を記述する
 *AppLogger関連ファイル:DataSourceConfiguration.java と　application.propertiesもしくはlogback.xml
 */
public class DbLogger extends AbstractJdbcLogger<Level> { 
	
	private static final Logger logger = LoggerFactory .getLogger("jp.co.cit.isid.DbLogger");

	public DbLogger() { 
		super(Level.INFO); 
	} 


	@Override
	public void logSql(String callerClassName, String callerMethodName, Sql<?> sql) { 
		logger.info(sql.getFormattedSql());
	 } 

	@Override
	protected void log(Level level, String callerClassName, String callerMethodName, Throwable throwable,
			Supplier<String> messageSupplier) {
		// TODO Auto-generated method stub
		
	}

}
