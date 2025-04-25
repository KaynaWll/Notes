import java.util.Date;

public class Note {

    //Classe com os dados da Nota

    private String title;
    private String content;
    private Date date;

    public Note() {
    }

    public Note(String title, String content, Date date) {
        this.title = title;
        this.content = content;
        //Dica do chat gpt para pegar a data de criação da nota
        this.date = new Date(date.getTime());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    //Método sobrescrito que retorna o título da Nota
    public String toString(){
        return this.title;
    }


}
