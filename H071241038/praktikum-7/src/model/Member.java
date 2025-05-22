package src.model;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int memberId;
    private List<LibraryItem> borrowedItems;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String borrow(LibraryItem item, int days) {
        // if (item.isBorrowed()) {
        //     throw new IllegalStateException("Item tidak tersedia");
        // }
        borrowedItems.add(item);
        return item.borrowItem(days);
    }

    public String returnItem(LibraryItem item, int daysLate) {
        borrowedItems.remove(item);
        item.returnItem();
        double fine = item.calculateFine(daysLate);
        return "Item " + item.getTitle() + " berhasil dikembalikan dengan denda: Rp " + String.format("%,.0f", fine);
    }

    public void getBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("Tidak ada item yang dipinjam");
            return;
        }

        System.out.println("+-----+----------------------------+");
        System.out.println("| ID  | Judul                      |");
        System.out.println("+-----+----------------------------+");
        for (LibraryItem item : borrowedItems) {
            System.out.printf("| %-3d | %-26s |\n", item.getItemId(), item.getTitle());
        }
        System.out.println("+-----+----------------------------+");
    }
}