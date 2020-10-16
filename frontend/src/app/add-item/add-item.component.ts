import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-add-item',
  templateUrl: './add-item.component.html',
  styleUrls: ['./add-item.component.scss'],
})
export class AddItemComponent implements OnInit {
  constructor(private _http: HttpService) {}

  onSubmit(data) {
    const formData = data.form.value;

    console.log('Form Submitted!');
    data.reset();

    this._http.addItem(formData).subscribe((res) => {
      console.warn(res);
    });
  }

  ngOnInit(): void {}
}
