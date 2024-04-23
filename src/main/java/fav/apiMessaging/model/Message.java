package fav.apiMessaging.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "MESSAGES")
public class Message {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String text;

    public Message() {}

    public Message(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id) && Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
