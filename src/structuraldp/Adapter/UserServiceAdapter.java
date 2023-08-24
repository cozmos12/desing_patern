package structuraldp.Adapter;

public class UserServiceAdapter implements NewUserService {
    NewUserRepository userRepository;
    OldUserRepository oldUserRepository;
    @Override
    public NewUser getNewUser(String email) {
        NewUser user = userRepository.getUser(email);
        OldUser oldUser=oldUserRepository.getUser(user.id);
        user.username=oldUser.username;
        user.lastname=oldUser.lastname;
        return user;
    }
}
