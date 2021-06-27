class Main {
    companion object : Callback{
        @JvmStatic
        fun main(args: Array<String>) {
            val controller = Controller(this)
            controller.rulesGame()
            controller.gameProcess()
            controller.playAgain()
        }
        override fun showResult(status: Boolean) {
            if (status) {
                println("Player 1 Menang, Player 2 Kalah")
            } else {
                println("Player 2 Menang, Player 1 Kalah")
            }
        }
    }
}



