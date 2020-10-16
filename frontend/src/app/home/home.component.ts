import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit {
  items: Object;

  constructor(private _http: HttpService) {}

  onKey(item, ob) {
    const data = { ...item, ...ob };
    this.onUpdate(data);
  }

  onUpdate(item) {
    // console.log(item);
    this._http.updateItem(item).subscribe((res) => {
      console.warn(res);
    });
  }

  onDelete(itemNo) {
    // console.log(itemNo);

    this._http.deleteItem(itemNo).subscribe((res) => {
      console.warn(res);

      let tmpItems = [];

      for (const key in this.items) {
        if (Object.prototype.hasOwnProperty.call(this.items, key)) {
          const element = this.items[key];
          // console.log(element);
          if (element.itemNo !== itemNo) {
            tmpItems.push(element);
          }
        }
      }

      this.items = tmpItems;
    });
  }

  ngOnInit(): void {
    this._http.getItems().subscribe((data) => {
      this.items = data;
      console.log(data);
    });
  }
}
