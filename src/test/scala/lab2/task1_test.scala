package lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Mux_5to1test extends FreeSpec with ChiselScalatestTester{
    "MuxLookUp2" in {test (new Mux_5to1){ c =>
        c.io.s2.poke(0.B)
        c.io.s1.poke(0.B)
        c.io.s0.poke(0.B)
        c.io.out.expect(0.U)
    }}}