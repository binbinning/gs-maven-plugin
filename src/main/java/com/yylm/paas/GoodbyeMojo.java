package com.yylm.paas;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "goodbye")
public class GoodbyeMojo extends AbstractMojo {

	@Parameter(property = "goodbye.words", defaultValue = "Bye bye!")
	private String words;

	public void execute() throws MojoExecutionException {
		getLog().info(words);
	}
}
