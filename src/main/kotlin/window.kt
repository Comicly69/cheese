import javax.swing.JFrame
import javax.swing.JLabel

fun main() {
    val frame = JFrame("Hello World")
    val label = JLabel("Hello, World!")
    label.horizontalAlignment = JLabel.CENTER
    label.verticalAlignment = JLabel.CENTER
    frame.add(label)
    frame.setSize(400, 300)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setLocationRelativeTo(null)
    frame.isVisible = true
}