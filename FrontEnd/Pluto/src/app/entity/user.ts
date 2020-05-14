import {UserType} from './userType';
export class User {
    readonly id;
    readonly email;
    readonly phone;
    readonly password;
    readonly  firstName;
    readonly  lastName;
    readonly gender;
    readonly  dateOfBirthday;
    readonly  registrationDate;
    readonly  imagePath;
    userType:UserType;
}
