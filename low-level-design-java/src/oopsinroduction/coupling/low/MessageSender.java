package oopsinroduction.coupling.low;

public class MessageSender {
    private final MessageService messageService;
    public MessageSender(MessageService messageService){
        this.messageService = messageService;
    }

    public void sendMessage(String message){
        messageService.sendMessage(message);
    }
}
