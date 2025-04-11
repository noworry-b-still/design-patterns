package S_Bridge;

// You are building a messaging system that supports different message types and multiple delivery methods.

// Requirements:
// You should be able to send:

// TextMessage
// EmailMessage
// AlertMessage

// Messages can be sent through:

// WhatsApp
// SMS
// Email

// Current problem:
// You’re tempted to create classes like WhatsAppTextMessage, SMSTextMessage, EmailAlertMessage, etc.
// This leads to a combinatorial explosion of classes as more message types and delivery channels are added.

interface IMode {
    String deliverMessage();
}

class WhatsApp implements IMode {
    @Override
    public String deliverMessage() {
        return " Whataspp delivery";
    }
}

class Email implements IMode {
    @Override
    public String deliverMessage() {
        return "Email delivery";
    }
}

class SMS implements IMode {
    @Override
    public String deliverMessage() {
        return "SMS delivery";
    }
}

abstract class Message {
    protected IMode mode;

    Message(IMode mode) {
        this.mode = mode;
    }

    abstract void sendMessage();
}

class TextMessage extends Message {
    TextMessage(IMode mode) {
        super(mode);
    }

    @Override
    void sendMessage() {
        System.out.println("TextMessage sent via " + mode.deliverMessage());
    }
}

class EmailMessage extends Message {
    EmailMessage(IMode mode) {
        super(mode);
    }

    @Override
    void sendMessage() {
        System.out.println("EmailMessage sent via " + mode.deliverMessage());
    }
}

class AlertMessage extends Message {
    AlertMessage(IMode mode) {
        super(mode);
    }

    @Override
    void sendMessage() {
        System.out.println("AlertMessage sent via " + mode.deliverMessage());
    }
}

public class P2_MessagingSystem_QA {
    public static void main(String[] args) {
        Message alert = new AlertMessage(new WhatsApp());
        alert.sendMessage();

        Message text = new TextMessage(new SMS());
        text.sendMessage();

        Message email = new EmailMessage(new Email());
        email.sendMessage();
    }
}
