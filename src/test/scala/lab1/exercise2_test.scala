// package lab1
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._

// class UpDownCounterTester extends FreeSpec with ChiselScalatestTester{
//     "Counter test" in {
//         test (new UpDownCounter(8.S)) { a=>
//         a.clock.step(1)
//         a.io.result.expect(0.B)
//         }
//     }
// }