import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class HttpService {
  constructor(private http: HttpClient) {}

  getItems() {
    return this.http.get('http://localhost:8080/api/v1/item');
  }

  addItem(data) {
    return this.http.post('http://localhost:8080/api/v1/item', data);
  }

  deleteItem(item) {
    return this.http.delete('http://localhost:8080/api/v1/item/' + item);
  }

  updateItem(item) {
    return this.http.put(
      'http://localhost:8080/api/v1/item/' + item.itemNo,
      item
    );
  }
}
