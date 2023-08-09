package practice
import chisel3._
import chisel3.util._

class or_hell extends Module {
    val io = IO(new Bundle {
        val in1 = Input(UInt(2.W))
        val in2 = Input(UInt(2.W))
        val out = Output(UInt(2.W))
    
    })
    io.out := io.in1 | io.in2
}