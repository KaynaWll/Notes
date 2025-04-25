import javax.swing.*;

//Classe criada com total ajuda do chatgpt. Ainda não manjo de GUI
public class NoteGUI {

    public NoteGUI() {
        //Janela principal
        JFrame frame = new JFrame("Gerenciador de Notas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        //Campo de título
        JLabel lbTitle = new JLabel("Título");
        lbTitle.setBounds(20, 20, 80, 25);
        JTextField txtTitle = new JTextField();
        txtTitle.setBounds(100, 20, 250, 25);

        //Campo de Conteúdo
        JLabel lbContent = new JLabel("Conteúdo");
        lbContent.setBounds(20, 60, 80, 25);
        JTextArea txtContent = new JTextArea();
        txtContent.setBounds(100, 60, 250, 100);

        //Botão Salvar
        JButton btnsave = new JButton("Salvar");
        btnsave.setBounds(100, 180, 100, 30);

        btnsave.addActionListener(e -> {
            String title = txtTitle.getText();
            String content = txtContent.getText();
            System.out.println("Título: " + title);
            System.out.println("Conteúdo: " + content);

        });
        // Adicionar tudo à janela
        frame.add(lbTitle);
        frame.add(txtTitle);
        frame.add(lbContent);
        frame.add(txtContent);
        frame.add(btnsave);

        frame.setVisible(true);
    }
}
