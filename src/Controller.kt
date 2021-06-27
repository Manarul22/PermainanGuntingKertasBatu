class Controller(private val listener: Callback) {
//  FUNGSI MENGULANG SIMBOL
    fun loopSymbols() {
        for (i in 1..50) {
            print("=")
        }
    }
//  FUNGSI PERATURAN PERMAINAN
    fun rulesGame() {
        loopSymbols()
        println()
        println("<<<<<<<<<<<<<< PERATURAN PERMAINAN >>>>>>>>>>>>>>>")
        println("1. Semua inputan menggunakan lowercase!")
        println("2. - Gunting vs Kertas -> 'Gunting' Menang!")
        println("3. - Gunting vs Batu -> 'Batu' Menang!")
        println("4. - Kertas vs Batu -> 'Kertas' Menang!")
        println("5. - Jika pilihan sama maka sama kuat -> 'Seri'!")
        loopSymbols()
        println()
        println()
    }
    fun gameProcess() {
//  MEMBUAT PILIHAN PLAYER
        println()
        println("<<<<<<<            MULAI BERMAIN           >>>>>>>")
        loopSymbols()
        println()
        println("Player 1 Silakan Pilih (gunting, kertas, batu)")
        print("Input Pilihan: ")
        var player1 = readLine()
        loopSymbols()
        println()
        println("Player 2 Silakan Pilih (gunting, kertas, batu)")
        print("Input Pilihan: ")
        var player2 = readLine()
        loopSymbols()
        println()
//  MENENTUKAN PEMENANG GAME
        var status: Boolean?
        when {
            player1 == player2 -> println("Hasil 'SERI', tiap Player memilih pilihan yang sama.")
            player1 == "batu" && player2 == "gunting" ||
            player1 == "kertas" && player2 == "batu" ||
            player1 == "gunting" && player2 == "kertas" -> {
                status = true
                listener.showResult(status)
            }
            player1 == "gunting" && player2 == "batu" ||
            player1 == "batu" && player2 == "kertas" ||
            player1 == "kertas" && player2 == "gunting" -> {
                status = false
                listener.showResult(status)
            }
            else -> println("Inputan tidak cocok!")
        }
        loopSymbols()
        println()
    }
//  FUNSGSI MENGULANG KEMBALI PERMAINAN
    fun playAgain() {
        var choice: String?
        var loop = true
        while (loop) {
            println("Apakah kamu ingin bermain lagi? ")
            println("Ketik 'yes' -> press 'ENTER' untuk memulai kembali.")
            println("Ketik 'no'  -> press 'ENTER' untuk keluar dari game.")
            choice = readLine()
            if (choice == "yes") {
                gameProcess()
            } else if (choice == "no"){
                println("Terima Kasih telah bermain...")
                loop = false
            } else {
                println("Anda salah input")
            }
        }
    }
}