package practice
import chisel3._
import chisel3.util._

class adder_hell extends Module {
    val io = IO(new Bundle {
        val in1 = Input(UInt(2.W))
        val in2 = Input(UInt(2.W))
        val sum = Output(UInt(2.W))
        val carryout = Output(UInt(2.W))
    })
    io.sum := io.in1 ^ io.in2
    io.carryout := io.in1 & io.in2
}