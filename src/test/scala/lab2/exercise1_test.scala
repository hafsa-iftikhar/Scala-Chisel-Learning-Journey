package lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class MuxLookup2test extends FreeSpec with ChiselScalatestTester{
    "MuxLookUp2" in {
        test (new Mux_2to1) { 
            c =>
            c.io.in_A.poke(6.U)
            c.io.in_B.poke(7.U)
            c.io.select(0.B)
            c.clock.step(100)
            c.io.out.expect(6.U)
        }
    }
}