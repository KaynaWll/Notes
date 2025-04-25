import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

//Classe criada com total ajuda do chatgpt. Ainda não manjo de GUI
public class NoteGUI {
    private ArrayList<Note> notes = new ArrayList<>();
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

            Note novaNota = new Note(title, content, new Date());
            notes.add(novaNota);
            JOptionPane.showMessageDialog(null, "Nota salva com sucesso");
            txtTitle.setText("");
            txtContent.setText("");

            System.out.println("Título: " + title);
            System.out.println("Conteúdo: " + content);

        });
        //Botão para exibir listas
        JButton btnShowList = new JButton("Minhas Notas");
        btnShowList.setBounds(205, 180, 150, 30);

        btnShowList.addActionListener(e -> {
            if (notes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Você ainda não tem nenhuma nota.");
                return;
            }
            StringBuilder mensagem = new StringBuilder();
            for (Note nota : notes) {
                mensagem.append("Titulo: ").append(nota.getTitle()).append("\n");
                mensagem.append("Conteúdo: ").append("\n").append(nota.getContent()).append("\n");
                mensagem.append("Data: ").append(nota.getDate()).append("\n");
                mensagem.append("--------------------\n");

            }
            JOptionPane.showMessageDialog(null, mensagem.toString());
        });
        // Adicionar tudo à janela
        frame.add(lbTitle);
        frame.add(txtTitle);
        frame.add(lbContent);
        frame.add(txtContent);
        frame.add(btnsave);
        frame.add(btnShowList);

        frame.setVisible(true);
    }
}
