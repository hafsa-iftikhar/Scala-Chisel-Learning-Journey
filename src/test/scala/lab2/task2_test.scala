package lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class barrel_shift_test extends FreeSpec with ChiselScalatestTester{
    "barrel_shift" in {test (new barrel_shift){ c =>
        c.io.in(0).poke(0.B)
        c.io.in(1).poke(0.B)
        c.io.in(2).poke(1.B)
        c.io.in(3).poke(1.B)

        //c.io.sel(0).poke(0.B)
        //c.io.sel(1).poke(1.B)
        c.io.sel.poke("b10".U)


        c.io.out(0).expect(1.B)
        c.io.out(1).expect(1.B)
        c.io.out(2).expect(0.B)
        c.io.out(3).expect(0.B)









    }}}