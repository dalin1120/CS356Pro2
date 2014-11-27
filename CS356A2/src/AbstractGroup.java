import java.util.Hashtable;

public interface AbstractGroup
{
   public String getUser();
   public String getUserId();
   public boolean groupStatus();
   public void setGroup(boolean groupStatus);
   public void addToGroup(AbstractGroup child);
  
}
