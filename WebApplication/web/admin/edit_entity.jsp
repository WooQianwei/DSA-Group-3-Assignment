<%-- 
    Document   : edit_entity
    Created on : Nov 16, 2020, 7:56:26 AM
    Author     : ITSUKA KOTORI
--%>

<%@page import="cilent.pages.EditEntity" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%
    EditEntity editEntity = EditEntity.getNewEditEntity(request.getParameter("edit"), request.getParameter("id"));
%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="<%= main.WebConfig.META_URL%>">
            <jsp:param name="title" value="Apprearance"/>
        </jsp:include>
    </head>
    <body>
        <jsp:include page="<%= main.WebConfig.ADMIN_HEADER_URL%>">
            <jsp:param name="menu_bar" value="Edit ${param.edit}"/>
        </jsp:include>
        <%= editEntity.getHtml()%>
        <jsp:include page="<%= main.WebConfig.ADMIN_FOOTER_URL%>"/>
    </body>
    <script>
        $(document).ready(function () {
            var input2 = $("<input>").attr("name", "edit").val("${param.edit}");
            $(".glyphicon-plus").click(function () {
                $.showConfirm({
                    title: "Confirm add",
                    body: "Do you sure want to add ? ",
                    onSubmit: function (result) {
                        if (result) {
                            var input = $("<input>").attr("name", "jsp-action").val("add");
                            input.type = 'hidden';
                            input2.type = 'hidden';
                            $('#updateform').append(input);
                            $('#updateform').append(input2);
                            $('#updateform').submit();
                        } else {
                        }
                    },
                    textTrue: "Add", Truecls: "btn btn-success",
                    textFalse: "No", Falsecls: "btn btn-secondary",
                    onDispose: function () {}
                });
            });
            $(".glyphicon-circle-arrow-up").click(function () {
                $.showConfirm({
                    title: "Confirm update",
                    body: "Do you sure want to update ? the record is no backup. ",
                    onSubmit: function (result) {
                        if (result) {
                            var input = $("<input>").attr("name", "jsp-action").val("update");
                            var input = $("<input>").attr("name", "id").val("${param.id}");
                            input.type = 'hidden';
                            input2.type = 'hidden';
                            $('#updateform').append(input);
                            $('#updateform').append(input2);
                            $('#updateform').submit();
                        } else {
                        }
                    },
                    textTrue: "Update", Truecls: "btn btn-warning",
                    textFalse: "No", Falsecls: "btn btn-secondary",
                    onDispose: function () {}
                });
            });
            $(".glyphicon-trash").click(function () {
                $.showConfirm({
                    title: "Please confirm",
                    body: "Do you sure want to delete ? the record is no backup. ",
                    onSubmit: function (result) {
                        if (result) {
                            var input = $("<input>").attr("name", "jsp-action").val("add");
                            input.type = 'hidden';
                            input2.type = 'hidden';
                            $('#updateform').append(input);
                            $('#updateform').append(input2);
                            $('#updateform').submit();
                        } else {
                        }
                    },
                    textTrue: "Delete", Truecls: "btn btn-danger",
                    textFalse: "No", Falsecls: "btn btn-secondary",
                    onDispose: function () {}
                });
            });
        });
    </script>
</html>
