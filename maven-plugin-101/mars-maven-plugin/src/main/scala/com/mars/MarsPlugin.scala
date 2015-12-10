package com.mars

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.{Mojo, Parameter}

@Mojo(name = "test")
class MarsPlugin extends AbstractMojo {

  @Parameter
  var para1 = ""

  @Parameter(defaultValue = "para2-default-value")
  var para2: String = ""

  @Parameter
  var para3: Array[String] = new Array[String](0)

  def execute(): Unit = {
    getLog.info("Start Mars Maven Plugin")

    println(s"para1=$para1")
    println(s"para2=$para2")
    println(s"para3=${para3.mkString(" ")}")

    getLog.info("Finish Mars Maven Plugin")
  }

}
