package annotation.prc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 언제까지 유지되는가
@Retention(RetentionPolicy.RUNTIME)
public @interface Count {
	int count();
}
