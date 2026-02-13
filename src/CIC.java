import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    // 1. Class is final so it cannot be extended
    public final class CIC {

        // 2. Fields are private and final
        private final String username;
        private final int accountId;

        // This is a mutable object, so we must be careful
        private final List<String> permissions;

        // 3. Constructor initializes all fields
        public CIC(String username, int accountId, List<String> permissions) {
            this.username = username;
            this.accountId = accountId;

            // 4. Defensive Copying: Create a new list so the caller
            // can't modify the internal list via the original reference.
            if (permissions == null) {
                this.permissions = new ArrayList<>();
            } else {
                this.permissions = new ArrayList<>(permissions);
            }
        }

        // 5. Only Getters, no Setters
        public String getUsername() {
            return username;
        }

        public int getAccountId() {
            return accountId;
        }

        // 6. Defensive Copying in Getter: Return an unmodifiable view
        // or a new copy so the caller can't do: getPermissions().add("Admin")
        public List<String> getPermissions() {
            return Collections.unmodifiableList(permissions);
        }

        @Override
        public String toString() {
            return "UserAccount{username='" + username + "', id=" + accountId + ", perms=" + permissions + "}";
        }
    }