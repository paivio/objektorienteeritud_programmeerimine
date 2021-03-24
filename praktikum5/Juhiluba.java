// ül 1

import java.time.LocalDate;

public class Juhiluba {
    private int lõpuaasta;

    public Juhiluba(int lõpuaasta) {
        this.lõpuaasta = lõpuaasta;
    }

    public boolean vanusOnVähemalt() {
        return lõpuaasta >= LocalDate.now().getYear();
    }

    @Override
    public String toString() {
        return "Juhiluba lõpuaastaga " + lõpuaasta;
    }
}
