import java.util.Hashtable;

public class UserGroup implements AbstractGroup
{
   private Hashtable<String, AbstractGroup> child;
   private String user;
   private String id;
   private boolean groupStat;
   
   public UserGroup(String n, String num)
   {
      user = n;
      id = num;
      child = new Hashtable<String, AbstractGroup>();  
      groupStat = true;
   }
   public void addToGroup(AbstractGroup childA)
   {
      child.put(childA.getUser(), childA);
   }
   public boolean groupStatus()
   {
      return groupStat;
   }
   public void setGroup(boolean groupStat)
   {
      this.groupStat = groupStat;
   }
   public String getUser()
   {
      return user;
   }
   public String getUserId()
   {
      return id;
   }
   public void accept(UserVisitor visitor)
   {
      visitor.visitGroup(this);
   }
   public AbstractGroup getChild(String childName) 
   {
      return child.get(childName);
   }
   public Hashtable<String, AbstractGroup> getChilds() 
   {
      return child;
   }
   public void remove(User user)
   {
      
   }
   
   
   
}
