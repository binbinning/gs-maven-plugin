package com.yylm.paas;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "greeting")
public class GreetingMojo extends AbstractMojo {

	@Parameter(property = "greeting.words", defaultValue = "Hello world!")
	private String words;

	public void execute() throws MojoExecutionException {
		getLog().info(words);
	}
}