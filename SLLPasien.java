public class SLLPasien{
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            int urut = 0;
            System.out.println("List Antrian Pasien : ");
            while (tmp != null){
                System.out.println("ID\t:"+tmp.data.id);
                System.out.println("NAMA\t:"+tmp.data.nama);
                System.out.println("NO.KAMAR\t:"+tmp.data.no_kamar);
                System.out.println("");
                tmp = tmp.next;
                urut++;
            }
        } else{
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void peek(){
        if (!isEmpty()){
            Node tmp = head;
            System.out.println("Pasien Terdepan yaitu : ");
            System.out.println("ID\t:"+tmp.data.id);
            System.out.println("NAMA\t:"+tmp.data.nama);
            System.out.println("NO.KAMAR\t:"+tmp.data.no_kamar);
        } else{
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void peekRear(){
        if (!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                if (tmp == tail){
                    System.out.println("Pasien Terakhir yaitu : ");
                    System.out.println("ID\t:"+tmp.data.id);
                    System.out.println("NAMA\t:"+tmp.data.nama);
                    System.out.println("NO.KAMAR\t:"+tmp.data.no_kamar);
                }
                tmp = tmp.next;
            }
        } else{
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void addLast(Pasien input){ //addLast
        Node ndInput = new Node(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void addFirst(Pasien input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void insertAfterUseString(int key, Pasien input){
        Node ndInput = new Node(input, null);
        Node temp = head ;
        do {
            //if (temp.data == key ){
                if (temp.data.id == key){
                ndInput.next = temp.next;
                temp.next = ndInput ;
                if(ndInput.next == null)
                    tail = ndInput;
                    break;
            }
            temp = temp.next;
        } while (temp != null);
    }

        // tambahan lagi insert at dengan index
    public void insertAt(int index, Pasien input){
        if(index < 0){
            System.out.println("indeks salah");
        } else if (index == 0){
            addFirst(input);
        } else {
            Node temp = head;
            for(int i = 0 ; i < index - 1 ; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null) tail = temp.next;
        }
    }

            // hapus data pertama
    public void Dequeue(){
        if(isEmpty()){
            System.out.println("Antrian Masih Kosong, Tidak Dapat Dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
            System.out.println("Dequeue Sukses");
        }
    }

    



    

























    
}