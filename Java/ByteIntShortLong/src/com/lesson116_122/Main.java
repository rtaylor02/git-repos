package com.lesson116_122;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 3.4);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("C.O.D", 5.25);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Stormbringer",playlist);
        albums.get(0).addToPlaylist("Hold on",playlist);
        albums.get(0).addToPlaylist(4,playlist); // Does not exist
        albums.get(1).addToPlaylist("Breaking the rules",playlist);
        albums.get(1).addToPlaylist("Hold on me",playlist); // Des not exist

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> iterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing: " + iterator.next().toString());
            printMenu();
        }


        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;
                    }
                    if(iterator.hasNext()) {
                        System.out.println("Now playing - " + iterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if(iterator.hasPrevious()) {
                        System.out.println("Now playing - " + iterator.previous().toString());
                    } else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(iterator.hasPrevious()) {
                            System.out.println("Replaying - " + iterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We have reached the start of the playlist");
                        }
                    } else {
                        if(iterator.hasNext()) {
                            System.out.println("Replaying - " + iterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }

                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0) {
                        iterator.remove();
                        if(iterator.hasNext()) {
                            System.out.println("Now playing - " + iterator.next().toString());
                        } else if(iterator.hasPrevious()) {
                            System.out.println("Now playing - " + iterator.previous().toString());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }

    private static void printMenu() {
        System.out.println("Menu options:");
        System.out.println("0 - quit\n" +
                           "1 - play next\n" +
                           "2 - play previous\n" +
                           "3 - replay current song\n" +
                           "4 - list songs in playlist\n" +
                           "5 - print menu options");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==========================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("==========================");
    }
}
