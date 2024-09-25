package pm;

    class Song {
        String title;
        Song next;

        // Constructor
        public Song(String title) {
            this.title = title;
            this.next = null;
        }
    }

    class Playlist {
        private Song head;

        // Constructor
        public Playlist() {
            this.head = null;
        }

        public void addSong(String title) {
            Song newSong = new Song(title);

            if (head == null) {
                head = newSong;
            } else {
                Song temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newSong;
            }
        }

        public void displayPlaylist() {
            if (head == null) {
                System.out.println("Playlist is empty.");
            } else {
                Song temp = head;
                while (temp != null) {
                    System.out.println(temp.title);
                    temp = temp.next;
                }
            }
        }

        public static void main(String[] args) {
            Playlist playlist = new Playlist();
            playlist.addSong("Ado");
            playlist.addSong("Aimyon");
            playlist.addSong("Back Number");

            System.out.println("Playlist:");
            playlist.displayPlaylist();
        }
    }


