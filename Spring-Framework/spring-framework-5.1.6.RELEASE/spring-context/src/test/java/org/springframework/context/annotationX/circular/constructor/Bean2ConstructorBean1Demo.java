package org.springframework.context.annotationX.circular.constructor;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.ejb.DependsOn;

/**
 * Spring Constructor DI  循环依赖  Bean2 Demo
 */
@Component
@DependsOn("Bean1ConstructorBean2Demo")
public class Bean2ConstructorBean1Demo {
	private Bean1ConstructorBean2Demo bean1;
	public Bean2ConstructorBean1Demo(Bean1ConstructorBean2Demo bean1DependBean2Demo1) {
		bean1 = bean1DependBean2Demo1;
	}

	public void hello() {
		System.out.println("Run Circular Dependency Success");
	}

	public void hellox() {
		bean1.hello();
	}

}
