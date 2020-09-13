package com.github.jalvarez.playscalajs

import com.github.jalvarez.playscalajs.shared.SharedMessages
import org.scalajs.dom

object ScalaJSExample {
  def main(args: Array[String]): Unit = {
    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
  }
}
