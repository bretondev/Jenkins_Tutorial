provider "aws" {
  region = "eu-west-3"
}

resource "aws_instance" "example" {
  count         = 2
  ami           = "ami-0f8d3c5dcfaceaa4f"
  instance_type = "t2.micro"

  tags = {
    Name = "provisioned-by-jenkins"
  }
}
