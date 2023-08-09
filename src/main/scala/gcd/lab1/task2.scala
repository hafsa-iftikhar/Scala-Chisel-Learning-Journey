package lab1
import chisel3 . _
class N_Counter ( counterBits : SInt ) extends Module {
    val io = IO ( new Bundle {
    val result = Output ( Bool () )
    })
    val count = RegInit (5. U (3. W ) )
    when ( count (2. U ) === true.B){
        count := 0. U
    } .otherwise {
        count := count + 1. U
    }
    io . result := count (15. U )
}