package ovh.witucki.data;

import jakarta.persistence.*;

@Entity
public class Role extends AbstractEntity  {
        private String name;
        private String description;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }
}
