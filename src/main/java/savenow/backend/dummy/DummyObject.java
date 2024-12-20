package savenow.backend.dummy;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import savenow.backend.domain.Gender;
import savenow.backend.domain.Role;
import savenow.backend.domain.User;

public class DummyObject {
    protected static User newUser(String username, String email) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("12341234");

        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .birth("19991204")
                .gender(Gender.MALE)
                .role(Role.USER)
                .build();
    }

    protected User newMockUser(Long id, String username, String email) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("1234");

        return User.builder()
                .id(id)
                .username(username)
                .password(password)
                .email(email)
                .gender(Gender.MALE)
                .birth("19991204")
                .build();
    }
}
