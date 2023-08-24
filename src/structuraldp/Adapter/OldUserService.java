package structuraldp.Adapter;

public class OldUserService {
    OldUserRepository oldUserRepository;

    public OldUser getUser(String userId){
      return   oldUserRepository.getUser(userId);
    }
}
