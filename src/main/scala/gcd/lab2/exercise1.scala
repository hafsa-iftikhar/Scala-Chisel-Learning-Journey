package lab2
import chisel3 . _
import chisel3.util._

class MuxLookup2 extends Bundle {
   val in_A = Input ( UInt (32.W) )
   val in_B= Input ( UInt (32.W) )
   val select = Input ( Bool () )
   val out = Output ( UInt (32.W) )
}

class Mux_2to1 extends Module {
   val io = IO ( new MuxLookup2 )
   io.out := Mux(io.select, io.in_A, io.in_B)
}
