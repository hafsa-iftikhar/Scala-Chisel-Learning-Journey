package lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class MuxLookuptest extends FreeSpec with ChiselScalatestTester{
    "MuxLookUp" in { test (new MuxLookup) { c 
        test (new  Mux_2to1_IO (4.S)) 
        a.clock.step(1)
        a.io.result.expect(0.B)
        }
    }
}