<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <div class="modal fade" id="signup-host" tabindex="-1" role="dialog" aria-labelledby="signup-host" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <form class="form-signup">
                        <div class="modal-header">
                            <h5 class="modal-title" id="signup-host">Signup for Host</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="row">
                                <div class="col">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td class="align-middle">Username:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Username">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Password:</td>
                                                <td>
                                                    <input type="password" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Password">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Confirm Password:</td>
                                                <td>
                                                    <input type="password" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Confirm password">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">First Name:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="First name">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Last Name:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Last name">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Identity Number:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="ID Number or Passport ID">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Homestay License</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="License">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Date of Birth</td>
                                                <td>
                                                    <input type="date" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Gender</td>
                                                <td>
                                                    <select class="custom-select mb-2 mr-sm-2 mb-sm-0" id="inlineFormCustomSelect">
                                                        <option selected>Choose...</option>
                                                        <option value="1">Male</option>
                                                        <option value="2">Female</option>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Home Address</td>
                                                <td>
                                                    <textarea class="form-control" id="exampleTextarea" rows="3"></textarea>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Email</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Email address">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Phone Number</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Phone number">
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Confirm</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="modal fade" id="signup" tabindex="-1" role="dialog" aria-labelledby="signup" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <form class="form-signup">
                        <div class="modal-header">
                            <h5 class="modal-title" id="signup">Signup for Guest</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="row">
                                <div class="col">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td class="align-middle">Username:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Username">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Password:</td>
                                                <td>
                                                    <input type="password" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Password">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Confirm Password:</td>
                                                <td>
                                                    <input type="password" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Confirm password">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">First Name:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="First name">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Last Name:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Last name">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Identity Number:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="ID Number or Passport ID">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Date of Birth</td>
                                                <td>
                                                    <input type="date" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Gender</td>
                                                <td>
                                                    <select class="custom-select mb-2 mr-sm-2 mb-sm-0" id="inlineFormCustomSelect">
                                                        <option selected>Choose...</option>
                                                        <option value="1">Male</option>
                                                        <option value="2">Female</option>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Home Address</td>
                                                <td>
                                                    <textarea class="form-control" id="exampleTextarea" rows="3"></textarea>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Email</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Email address">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Phone Number</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Phone number">
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Confirm</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="login" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <form class="form-signin">
                        <div class="modal-header">
                            <h5 class="modal-title" id="login">Login</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="row">
                                <div class="col">
                                    <label for="Email" class="sr-only">Email</label>
                                    <input type="email" id="Email" class="form-control" placeholder="Email address" required autofocus="">
                                    <label for="Password" class="sr-only">Password</label>
                                    <input type="password" id="Password" class="form-control" placeholder="Password" required autofocus="">
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                        </div>
                </div>
                </form>
            </div>
        </div>