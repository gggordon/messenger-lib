package phones;

import storage.StorageProvider;
import messages.Message;
import messages.TextMessage;
import messages.PhotoMessage;
import java.util.List;

public abstract class Phone {
   protected StorageProvider storage;
   
   public Phone(StorageProvider storageProvider) {
	   storage = storageProvider;
   }
   
   public void viewAllMessages() {
	   List<Message> messages = storage.retrieveAll();
	   for(Message m : messages) {
		   
		   System.out.println(m);
		   if(m instanceof TextMessage) {
			   System.out.println("This is a text message");
			   TextMessage textMessage = (TextMessage) m;
		   }
		   if(m instanceof PhotoMessage) {
			   System.out.println("This is a photo message");
			   
		   }
	   }
	   messages.forEach(
		   System.out::println
	   );
   }
}
