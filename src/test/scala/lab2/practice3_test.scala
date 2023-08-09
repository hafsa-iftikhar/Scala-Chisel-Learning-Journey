package lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class decoder4_to_1test extends FreeSpec with ChiselScalatestTester{
    "decoder" in { test (new decoder4_to_1) {c =>
        c.io.in0.poke(1.U)
        c.io.in1.poke(0.U)
        c.io.in2.poke(1.U)
        c.io.in3.poke(0.U)
        c.io.sel.poke("b00".U)
        c.io.out.expect (0.U)
    }
}}