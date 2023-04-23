import java.awt.BorderLayout
import java.awt.Font
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel

fun main() {
    val frame = JFrame("Cheese")
    val imageIcon = ImageIcon("/home/max/code/lenny/src/assets/cheese.jpg")
    val backgroundLabel = JLabel(imageIcon)
    backgroundLabel.layout = BorderLayout()
    val textLabel = JLabel("Cheese")
    textLabel.font = Font("Arial", Font.BOLD, 36)
    textLabel.horizontalAlignment = JLabel.CENTER
    textLabel.verticalAlignment = JLabel.CENTER
    backgroundLabel.add(textLabel)
    frame.contentPane = backgroundLabel
    frame.setSize(400, 300)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setLocationRelativeTo(null)
    frame.isVisible = true
}
