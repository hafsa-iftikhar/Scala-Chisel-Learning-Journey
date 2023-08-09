// package lab1
// import chisel3 . _
// class UpDownCounter ( size : Int , maxValue : Int ) extends Module {
// val io = IO ( new Bundle {
// val out = Output ( Bool () )
// })
// def genUpDownCounter ( n : Int , max : Int ) = {
// val count = RegInit (0. U ( n . W ) )
// val up = RegInit(true.B)
// when(count === 0.U) {
//       up := true.B
//     } .elsewhen(count === max.U) {
//       up := false.B
//     }

// when(up){
//     count := count + 1.U
// }.otherwise {
// count := count - 1. U
// }
// (count,up)
// }
// val (counter,up) = genUpDownCounter ( size , maxValue )
// io . out := ( count === 0.U || count === maxValue.U) 
// }
