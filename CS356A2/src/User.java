import javax.swing.DefaultListModel;
import java.util.Hashtable;

public class User implements ObserverUser, AbstractGroup
{
   private String name;
   private String idNum;
   private Hashtable<String, AbstractGroup> child;
   private OutgoingMessage message;
   private boolean groupStatus;
   private DefaultListModel<User> following;
   private DefaultListModel<User> follower;
   private DefaultListModel<OutgoingMessage> newsFeed;
   
   public User(String user, String id)
   {
      name = user;
      idNum = id;
      following = new DefaultListModel<User>();
      follower = new DefaultListModel<User>();
      newsFeed = new DefaultListModel<OutgoingMessage>();
   }

   public void attach(User user)
   {
      following.addElement(user);
      user.getfollower().addElement(this);
   }
   public DefaultListModel<OutgoingMessage> getNews()
   {
      return newsFeed;
   }
   public DefaultListModel<User> getfollowing()
   {
      return following;
   }
   public DefaultListModel<User> getfollower()
   {
      return follower;
   }
   public void tweetMessage(String msg)
   {
      message = new OutgoingMessage(msg, this);
      newsFeed.addElement(message);
      notifyFollower();
      
   }
   public void notifyFollower()
   {
      for(int i = 0; i < follower.getSize(); i++)
      {
         follower.elementAt(i).update(this);
      }
   }
   
   public void update(User person)
   {
      newsFeed.addElement(person.message);
   }
   public void setGroup(boolean holder)
   {
      groupStatus = holder;
   }


   public void addToGroup(AbstractGroup childs)
   {
      child.put(childs.getUser(), childs);
   }
   
   public void remove(User user)
   {
      
   }

   public boolean groupStatus()
   {
      return groupStatus;
   }

   public void unattach()
   {
      
   }
   public void accept(UserVisitor visitor)
   {
      visitor.visitUser(this);
   }

   public String getUser() 
   {
      return name;
   }

   
   public String getUserId() 
   {
      return idNum;
   }

   public AbstractGroup getChild(String childName) 
   {
      return child.get(childName);
   }

   public Hashtable<String, AbstractGroup> getChilds() 
   {
      return child;
   }
   
}

