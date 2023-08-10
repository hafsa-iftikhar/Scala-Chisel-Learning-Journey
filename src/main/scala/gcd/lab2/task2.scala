package lab2
import chisel3 . _
import chisel3.util._

class barrel_shift extends Module {
    val io = IO ( new Bundle {
    val in = Vec (4 , Input ( Bool () ) )
    val sel = Input (UInt(2.W))
    val shift_type = Input ( Bool () )
    val out = Vec (4 , Output ( Bool () ) )
})
val m1 = Mux(io.shift_type, io.in(2),0.U)
val m2 = Mux(io.shift_type, io.in(1),0.U)
val m3 = Mux(io.shift_type, io.in(0),0.U)
val m4 = Mux(io.shift_type, io.in(1),0.U)
val m5 = Mux(io.shift_type, io.in(0),0.U)
val m6 = Mux(io.shift_type, io.in(0),0.U)

io.out(0) := MuxLookup(io.sel, false.B, Array(
    (0. U ) -> io.in(0),
    (1. U ) -> io.in(1),
    (2. U ) -> io.in(2),
    (3. U ) -> io.in(3))
)
io.out(1) := MuxLookup(io.sel, false.B, Array(
    (0. U ) -> io.in(0),
    (1. U ) -> io.in(1),
    (2. U ) -> io.in(2),
    (3. U ) -> m6)
)
io.out(2) := MuxLookup(io.sel, false.B, Array(
    (0. U ) -> io.in(0),
    (1. U ) -> io.in(1),
    (2. U ) -> m5,
    (3. U ) -> m4)
)
io.out(3) := MuxLookup(io.sel, false.B, Array(
    (0. U ) -> io.in(0),
    (1. U ) -> m3,
    (2. U ) -> m2,
    (3. U ) -> m1)
)
}
