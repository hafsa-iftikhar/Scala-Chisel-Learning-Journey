// package lab1
// import chisel3 . _
// class M_Counter ( size : Int , maxValue : Int ) extends Module {
// val io = IO ( new Bundle {
// val result = Output ( Bool () )
// })
// def genCounter ( n : Int , max : Int ) = {
// val count = RegInit (0. U ( n . W ) )
// when ( count === max.U) {
// count := 0. U
// } .otherwise {
// count := count + 1. U
// }
// count
// }
// val counter1 = genCounter ( size , maxValue )
// io . result := counter1 ( size -1)
// }
