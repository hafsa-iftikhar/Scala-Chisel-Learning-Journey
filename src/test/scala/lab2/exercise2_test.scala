package lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class MuxLookuptest extends FreeSpec with ChiselScalatestTester{
    "MuxLookUp" in { test (new MuxLookup) {c =>
        c.io.in0.poke(1.B)
        c.io.in1.poke(1.B)
        c.io.in2.poke(0.B)
        c.io.in3.poke(0.B)
        c.io.in4.poke(1.B)
        c.io.in5.poke(1.B)
        c.io.in6.poke(0.B)
        c.io.in7.poke(0.B)
        c.io.s0.poke(0.U)
        c.io.s1.poke(3.U)
        c.io.s2.poke(6.U)
        c.clock.step(1)
        c.io.out.expect(0.B)
    
    
     }}}