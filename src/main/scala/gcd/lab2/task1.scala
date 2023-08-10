package lab2
import chisel3 . _
import chisel3.util._

class LM_IO_Interface extends Bundle {
    val s0 = Input(Bool())
    val s1 = Input(Bool())
    val s2 = Input(Bool())
    val out = Output(UInt(32.W))
}

class Mux_5to1 extends Module{
    val io = IO (new LM_IO_Interface)

    io.out := MuxLookup(Cat(io.s2, io.s1, io.s0), 0.U, 
    Array(
        "b000".U -> 0.U,
        "b001".U -> 1.U,
        "b010".U -> 2.U,
        "b011".U -> 3.U,
        "b100".U -> 4.U,
        "b101".U -> 4.U,
        "b110".U -> 4.U,
        "b111".U -> 4.U,

    )
    )
}

