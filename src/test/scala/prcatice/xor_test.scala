package practice
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class xorTester extends FreeSpec with ChiselScalatestTester{
    "Chisel Tester file1" in {
        test (new xor_hell) { a=>
        a.io.in1.poke(1.U)
        a.io.in2.poke(1.U)
        a.clock.step(1)
        a.io.out.expect(0.U)
        }
    }
}